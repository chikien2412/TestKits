import axios from 'axios';

const API_URL = 'http://localhost:8080';

const register = (userData) => {
  return axios.post(`${API_URL}/register`, userData);
}

export { register };